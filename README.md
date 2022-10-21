Application Overview :

This application is used to run the Kafka Publishing job which is pulling data from oracle and passing the data to Kafka using Avro schema. The kafka message standard is Avro JSON.
Application running for 3 topics which are Eligibility , Preferences and Security.

Application Setup :

This is Spring Boot app :

Building App :

MVN CLEAN INSTALL

Running App. :

mvn springboot run -Dprofiles.active=preferences ; security ; eligility

https://teams.microsoft.com/l/meetup-join/19%3ameeting_ZTI1N2E0YjEtODA1NS00YTRhLTg0NmItYTc2NDMzZTMwZTVi%40thread.v2/0?context=%7b%22Tid%22%3a%22db05faca-c82a-4b9d-b9c5-0f64b6755421%22%2c%22Oid%22%3a%22bfc371f6-2b2f-4157-a86f-055c7f594c1b%22%7d
