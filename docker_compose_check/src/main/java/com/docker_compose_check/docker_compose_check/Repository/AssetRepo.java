package com.docker_compose_check.docker_compose_check.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.docker_compose_check.docker_compose_check.Model.Asset;

public interface AssetRepo extends MongoRepository<Asset, String> {

}
