package com.xworkz.googleapps.service;

import com.xworkz.googleapps.dto.GoogleAppsDto;

public interface GoogleAppsService {
       boolean validateSave(GoogleAppsDto googleAppsDto);
       void read();
       
}