# LandingPage

This web starter template is based on Spring, PostgreSQL, React, React router and Axios. Check the following links for documentation and guides:

- [Spring](https://spring.io/projects/spring-boot)
- [SQLite](https://www.sqlite.org/index.html)


### Starting the backend server
Open the root folder and run
```
./gradlew bootRun
```


## Backend - API

### Employee Routes

| HTTP Method | HTTP Path | Action |
| ------------|-----------|--------|
| `GET`    | `/employees/list?queryList={employeeID1,employeeID2,employeeID3}`      | return list of employees with matching employeeID. |
| `GET`    | `/users/{employeeID}` | return information about the employee with the matching employeeID|
| `GET`   | `/employees`      | return a list of all the employees.|

 
