package com.xworkz.googleapps.repository;

import com.xworkz.googleapps.dto.GoogleAppsDto;

public interface GoogleAppsRepository {
       boolean onSave(GoogleAppsDto googleAppsDto);
       GoogleAppsDto[] read();
}