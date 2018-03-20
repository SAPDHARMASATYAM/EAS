package in.co.examsadda.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Section;

public interface PracticePaperCurdRepository extends CrudRepository<PracticePaper, String> {

	List<Section> findSectionsByPaperId(Long paperId);

}
