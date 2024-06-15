# Example Flow

1. A client makes a GET request to http://localhost:8080/employees.
2. The getEmployee() method is invoked.
3. Inside this method, a GET request is made to http://localhost:8080/address to fetch an address.
4. The address is obtained and stored in the address variable.
5. A string containing a name, email, and the fetched address is returned as the response.
## Dependencies
<span style="color:lawngreen"> *restTemplate*</span>: This is to be an instance of RestTemplate created as a bean to be autowired, a class provided by Spring to make REST calls which getting deprecated soon. It is typically auto-configured and injected into the controller(@bean created under config folder at the moment).

http://localhost:8080/address: This endpoint is anothe(address endpong REST endpoint available in the the address module/application or server, which is being called from the employee application using restTemplate and returns an address in the response body.

### Note 
- For the code to work, the RestTemplate instance needs to be defined and injected by autowire into the controller class.... We created a bean for it to work 
- Because RestTemplate is being deprecated, it might be removed in spring soon
- Going forward, we will need to use Feign Client, WebClient as a replacement of Rest Template.
- RestTemplate blocks threads...