package com.tripdeal.services.guide;

import com.tripdeal.models.Guide;
import com.tripdeal.repository.guide.GuideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class GuideService  implements IGuideService{
    @Autowired
   private  GuideRepository guideRepository;

    @Override
    public int save(Guide guide) {
        return guideRepository.save(guide) ;
    }

    @Override
    public int update(Guide guide) {
        return guideRepository.update(guide);
    }

    @Override
    public int deleteById(int id) {

       return guideRepository.deleteById(id);
    }

    @Override
    public List findAll() {
        return guideRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return guideRepository.findById(id);
    }
}
