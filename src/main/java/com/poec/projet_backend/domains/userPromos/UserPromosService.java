package com.poec.projet_backend.domains.userPromos;

import com.poec.projet_backend.domains.AbstractService;
import com.poec.projet_backend.domains.promos.Promos;
import com.poec.projet_backend.domains.promos.PromosRepository;
import com.poec.projet_backend.domains.userImpl.UserImpl;
import com.poec.projet_backend.domains.userImpl.UserImplRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserPromosService extends AbstractService<UserPromos, Long> {

    private final PromosRepository promosRepository;
    private final UserImplRepository userRepository;


    public UserPromosService(JpaRepository<UserPromos, Long> repository, PromosRepository promosRepository, UserImplRepository userRepository) {
        super(repository);
        this.userRepository = userRepository;
        this.promosRepository = promosRepository;
    }
    
    @Override
    public UserPromos update(UserPromos entity, Long id) {
        UserPromos foundUserPromo = getById(id);
        foundUserPromo.setPromos(entity.getPromos());
        foundUserPromo.setRedeemed(entity.isRedeemed());
        return repository.save(foundUserPromo);
    }

    public UserPromos addPromoToUser(Long userId, Long promoId) {
        UserImpl user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        Promos promo = promosRepository.findById(promoId)
                .orElseThrow(() -> new RuntimeException("Promo not found"));

        if (user.getPoints() < promo.getPrice()) {
            throw new RuntimeException("Not enough points");
        }

        if (promo.getAmount() <= 0) {
            throw new RuntimeException("Promo is out of stock");
        }

        user.setPoints(user.getPoints() - promo.getPrice());
        promo.setAmount(promo.getAmount() - 1);

        UserPromos userPromos = new UserPromos();
        userPromos.setUser(user);
        userPromos.setPromos(promo);
        userPromos.setRedeemed(false);
        userPromos.setPurchased(true);

        userRepository.save(user);
        promosRepository.save(promo);
        return repository.save(userPromos);
    }
}
