package kodlamaio.Hrms.business.abstracts;

import java.util.List;



import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {
	DataResult<List<SystemPersonnel>> getAll();
	Result Add(SystemPersonnel systemPersonnel);
	Result Delete(SystemPersonnel systemPersonnel);

}
