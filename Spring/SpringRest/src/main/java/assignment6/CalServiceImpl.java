package assignment6;

import org.springframework.stereotype.Service;

@Service
public class CalServiceImpl implements calService{

	int a=5;
	int b=10;

	@Override
	public int functionality() {
		return a + b;
	}
}
