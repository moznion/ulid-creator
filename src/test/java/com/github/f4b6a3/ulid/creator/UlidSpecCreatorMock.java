package com.github.f4b6a3.ulid.creator;

import com.github.f4b6a3.ulid.creator.UlidSpecCreator;

class UlidSpecCreatorMock extends UlidSpecCreator {

	public UlidSpecCreatorMock(long random1, long random2, long randomMax1, long randomMax2, long previousTimestamp) {
		super();
		
		this.random1 = random1;
		this.random2 = random2;

		this.randomMax1 = randomMax1;
		this.randomMax2 = randomMax2;

		this.previousTimestamp = previousTimestamp;
	}
}