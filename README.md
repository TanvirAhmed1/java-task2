# java-task2
It is a project management tool to keep track of inhouse projects

This project uses a MySql database named projectdb. A database is needed to be created.

pom.xml:
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.5.2</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>tech.newroz</groupId>
	<artifactId>projectmanager</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>projectmanager</name>
	<description>Project Manager App</description>
	<properties>
		<java.version>11</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
</project>

API Endpoints:

http://localhost:8080/project/add (POST)
http://localhost:8080/project/all (GET)
http://localhost:8080/project/find/{id} (GET)
http://localhost:8080/project/update (PUT)
http://localhost:8080/project/delete/{id} (DELETE)

http://localhost:8080/task/add (POST)
http://localhost:8080/task/all (GET)
http://localhost:8080/task/find/{id} (GET)
http://localhost:8080/task/update (PUT)
http://localhost:8080/task/delete/{id} (DELETE)

Sample JSON for http://localhost:8080/project/add (POST):

{        
        "name": "Project X-Ray",
        "description": "Very important project",
        "status": "InProgress",
        "tasks": [
        	{"name": "Task 1",
        	  "status": "Completed"
        	},
        	{"name": "Task 2",
        		"status": "OnHold"
        	}
        	]
    }
    
    Sample Response:
    
    Status: 201 Created, Time: 63ms
    
    {
    "id": 13,
    "name": "Lorem Ipsum Dolom 2",
    "description": "Very important project",
    "status": "Ongoing",
    "projectId": "6f897b38-46d9-42c2-aa4b-f479f6452407",
    "tasks": [
        {
            "id": 14,
            "name": "Task 1",
            "status": "Done",
            "taskId": "c3b09173-c008-4006-9187-34ca6f593ff6"
        },
        {
            "id": 15,
            "name": "Task 2",
            "status": "Ongoing",
            "taskId": "1b2c9cfe-5c7d-447a-89e4-c668d63b98ab"
        }
    ]
}

Thank You, Have a nice day.
