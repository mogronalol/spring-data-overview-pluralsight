package com.pluralsight.springdataoverview;

import static org.assertj.core.api.Assertions.assertThat;

import com.pluralsight.springdataoverview.entity.Flight;
import com.pluralsight.springdataoverview.repository.FlightRepository;
import java.time.LocalDateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CrudTests {

	@Autowired
	private FlightRepository flightRepository;

	@Test
	public void shouldPerformCRUDOperations() {
		final Flight flight =  new Flight();
		flight.setOrigin("London");
		flight.setDestination("New York");
		flight.setScheduledAt(LocalDateTime.parse("2011-12-13T12:12:00"));

		flightRepository.save(flight);

		assertThat(flightRepository.findAll())
			.hasSize(1)
			.first()
			.isEqualToComparingFieldByField(flight);

		flightRepository.deleteById(flight.getId());

		assertThat(flightRepository.count()).isZero();
	}

}
