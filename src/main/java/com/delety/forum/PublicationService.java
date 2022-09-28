package com.delety.forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicationService {

    @Autowired
    private PublicationRepository publicationRepository;

    public List<Publication> findAll(){

        return publicationRepository.findAll();

    }

    public Publication findById(Long id){
        Optional<Publication> obj = publicationRepository.findById(id);
        return obj.get();
    }
}
