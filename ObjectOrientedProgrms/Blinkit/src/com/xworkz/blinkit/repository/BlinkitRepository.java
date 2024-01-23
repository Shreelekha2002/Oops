package com.xworkz.blinkit.repository;

import com.xworkz.blinkit.dto.BlinkitDto;

public interface BlinkitRepository {
	boolean onSave(BlinkitDto blinkitDto);

	BlinkitDto[] read();
}
