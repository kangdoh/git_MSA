package com.example.ex07;

import com.example.ex07.Freeboard.FreeBoardRepository;
import com.example.ex07.Freeboard.freeBoard;
import com.example.ex07.user.User;
import com.example.ex07.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.transform.sax.SAXResult;
import java.util.Arrays;

@SpringBootTest
class Ex07ApplicationTests {


	@Test
	void contextLoads() {
		String []str = {"10입니다", "20입니다.", "30입니다."};
		Arrays.stream(str).forEach(System.out::println);
		String result = Arrays.stream(str).reduce("", (s, s2) -> s+s2 );
	}


	@Autowired
	FreeBoardRepository freeBoardRepository;

	@Autowired
	UserRepository userRepository;



	@Test
	void insertTest(){

	}

	@Test
	void selectTest(){

	}

	@Test
	void deleteTest(){
		freeBoardRepository.deleteById(1l);
	}

	@Test
	void updateTest(){
		User user = User.builder()
				.name("d")
				.age(10)
				.email("dfdf")
				.password("dfd")
				.build();

//		freeBoard freeboard = freeBoard.builder()
//				.idx()
//				.title("d")
//				.content("Df")
//				.
	}

}
