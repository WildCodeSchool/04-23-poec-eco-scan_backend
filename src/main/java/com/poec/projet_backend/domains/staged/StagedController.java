package com.poec.projet_backend.domains.staged;

import com.poec.projet_backend.domains.AbstractController;
import com.poec.projet_backend.domains.rubbish.Rubbish;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/staged")
@RequiredArgsConstructor
public class StagedController extends AbstractController<Staged> {

    @Autowired
    private StagedService stagedService;


    @PostMapping("/add/{stagedId}")
    public ResponseEntity<Staged> addRubbishToStaged(@PathVariable Long stagedId, @RequestBody Rubbish rubbish) {
        System.out.println(rubbish);
        Staged updatedStaged = stagedService.addRubbishToStaged(stagedId, rubbish);
        if (updatedStaged != null) {
            return ResponseEntity.ok(updatedStaged);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{stagedId}/delete/rubbish/{rubbishId}")
    public ResponseEntity<List<Rubbish>> removeRubbish(@PathVariable Long stagedId, @PathVariable Long rubbishId) {
        List<Rubbish> updatedRubbishList = stagedService.removeRubbishFromStaged(stagedId, rubbishId);
        return ResponseEntity.ok(updatedRubbishList);
    }
}
