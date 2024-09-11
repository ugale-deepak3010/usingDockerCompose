package com.docker_compose_check.docker_compose_check.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker_compose_check.docker_compose_check.Model.Asset;
import com.docker_compose_check.docker_compose_check.Repository.AssetRepo;


@RestController
@RequestMapping("/asset")
public class AssetController {

    @Autowired
    AssetRepo assetRepo;


    @GetMapping("/")
    public List<Asset> getMethodName() {

        if (assetRepo.findAll().isEmpty()) {
            assetRepo.save(new Asset("One", "Laptop", 5, "Electronics"));
        }

        return assetRepo.findAll();
    }


    
}
