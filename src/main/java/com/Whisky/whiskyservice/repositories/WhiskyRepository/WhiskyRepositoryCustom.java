package com.Whisky.whiskyservice.repositories.WhiskyRepository;

import com.Whisky.whiskyservice.models.Distillery;
import com.Whisky.whiskyservice.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> getWhiskyFromACetainYear(int year);

    List<Whisky> getWhiskyFromACetainRegion(String region);

    List<Distillery> getAll12YearOldWhisky(Distillery distillery);



}
