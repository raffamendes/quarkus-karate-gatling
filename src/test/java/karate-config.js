function fn() {
	var env = karate.env;
	karate.log('karate.env system property was: ', env);
	
	var config ={
		env: env,
		baseUrl: 'http://localhost:8080'
	}
	return config
}