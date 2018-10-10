package com.Whisky.whiskyservice.repositories.DistilleryRepository;

import com.Whisky.whiskyservice.models.Distillery;
import com.Whisky.whiskyservice.models.Whisky;

import java.util.List;

public interface DistilleryRepositoryCustom {

    List<Distillery> getDistillertFromACetainRegion(String region);

    List<Whisky> getWhiskyForDistillery(Distillery distillery);


}
