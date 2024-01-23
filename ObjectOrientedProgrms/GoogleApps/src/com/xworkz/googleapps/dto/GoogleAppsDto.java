package com.xworkz.googleapps.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class GoogleAppsDto {
           private String applicationId;
           private String applicationName;
           private float applicationCost;
           private int applicationStorage;
           private String applicationVersion;
           
}