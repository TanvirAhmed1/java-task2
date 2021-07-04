# java-task2
It is a project management tool to keep track of inhouse projects

This project uses a MySql database named projectdb. A database is needed to be created.

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
