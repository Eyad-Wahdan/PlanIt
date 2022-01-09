package htw.berlin.webtech.PlanIt;

import htw.berlin.webtech.PlanIt.Termin.TerminEntity;
import htw.berlin.webtech.PlanIt.Termin.TerminRepository;
import htw.berlin.webtech.PlanIt.Termin.TerminService;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.Mockito;
import java.sql.Timestamp;
import java.util.List;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith({MockitoExtension.class})
class PlanItApplicationTests implements WithAssertions {

	private final TerminService service = new TerminService();

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("should transform TerminEntity to Termin")
	void transform_TerminEntity() {

		TerminEntity terminEntity = Mockito.mock(TerminEntity.class);
		doReturn(25L).when(terminEntity).getId();
		doReturn(Timestamp.valueOf("2022-01-25 15:15:00")).when(terminEntity).getStart();
		doReturn(Timestamp.valueOf("2022-01-25 17:15:00")).when(terminEntity).getFinish();
		doReturn("WebTech-Klausur").when(terminEntity).getEvent();

		var result = service.transformEntity(terminEntity);

		assertThat(result.getId()).isEqualTo(25);
		assertThat(result.getStart()).isEqualTo(Timestamp.valueOf("2022-01-25 15:15:00"));
		assertThat(result.getFinish()).isEqualTo(Timestamp.valueOf("2022-01-25 17:15:00"));
		assertThat(result.getEvent()).isEqualTo("WebTech-Klausur");
	}
}
