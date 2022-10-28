package com.example.rest;


	import static org.assertj.core.api.Assertions.assertThat;
	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
	import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
	import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
	import org.springframework.http.HttpMethod;
	import org.springframework.http.MediaType;
	import org.springframework.test.context.jdbc.Sql;
	import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
	import org.springframework.test.web.servlet.MockMvc;

	import com.example.persistence.domain.Customer;
import com.example.persistence.domain.MembershipType;
import com.fasterxml.jackson.core.JsonProcessingException;
	import com.fasterxml.jackson.databind.ObjectMapper;
	

	@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
	@AutoConfigureMockMvc
	@Sql(scripts = "classpath:customer.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
	public class CustomerControllerIntegrationTest {

		@Autowired
		private MockMvc mockMVC;

		@Autowired
		private ObjectMapper mapper;
		
		private Long temp=null;
		
		private final Customer TEST_Customer = new Customer(temp,"Nathiya","London","nathiya@gmail.com",12345678l,"suchagreatlife1" ,"easylife","01012002","VISA",new MembershipType());

		private final Customer TEST_SAVED_Customer = new Customer(4,"Nathiya","London","nathiya@gmail.com",12345678l,"suchagreatlife1" ,"easylife","01012002","VISA",new MembershipType());

		/*@Test
		public void testCreate() throws JsonProcessingException, Exception {
			String resultString = this.mockMVC
					.perform(post("/customer/create").contentType(MediaType.APPLICATION_JSON)
							.content(this.mapper.writeValueAsString(TEST_PERSON)))
					.andExpect(status().isCreated()).andReturn().getRequest().getContentAsString();

			Person result = this.mapper.readValue(resultString, Person.class);
			assertThat(result).isEqualTo(TEST_PERSON);
		}

		@Test
		public void testReadOne() throws Exception {
			this.mockMVC.perform(get("/person/read/1")).andExpect(status().isOk())
					.andExpect(content().json(this.mapper.writeValueAsString(TEST_SAVED_PERSON)));

		}

		@Test
		public void testZZZ() throws Exception {
			final List<Person> PEOPLE = new ArrayList<>();
			PEOPLE.add(TEST_SAVED_PERSON);

			final String resultString = this.mockMVC
					.perform(request(HttpMethod.GET, "/person/readAll").accept(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();

			List<Person> results = Arrays.asList(mapper.readValue(resultString, Person[].class));
			assertThat(results).contains(this.TEST_PERSON).hasSize(3);
		}

		@Test
		public void testUpdate() throws Exception {
			final Person newPerson = new Person(null, 26, "Chris Perrins");
			String resultString = this.mockMVC
					.perform(put("/person/update/3").contentType(MediaType.APPLICATION_JSON)
							.content(this.mapper.writeValueAsString(newPerson)))
					.andExpect(status().isAccepted()).andReturn().getRequest().getContentAsString();

			Person result = this.mapper.readValue(resultString, Person.class);
			assertThat(result).isEqualTo(newPerson);
		}*/

		@Test
		public void testDelete() throws Exception {
			this.mockMVC.perform(delete("/customer/delete/2")).andExpect(status().isNoContent());
		}
}
