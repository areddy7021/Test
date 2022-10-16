Application Overview :

This application is used to run the Kafka Publishing job which is pulling data from oracle and passing the data to Kafka using Avro schema. The kafka message standard is Avro JSON.
Application running for 3 topics which are Eligibility , Preferences and Security.

Application Setup :

This is Spring Boot app :

Building App :

MVN CLEAN INSTALL

Running App. :

mvn springboot run -Dprofiles.active=preferences ; security ; eligility
