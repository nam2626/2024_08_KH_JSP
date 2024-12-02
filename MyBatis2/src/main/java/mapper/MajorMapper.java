package mapper;

import java.util.List;

import dto.MajorDTO;

public interface MajorMapper {

	List<MajorDTO> selectAllMajor();
	List<MajorDTO> selectMajorList(String[] arr);
	

}
