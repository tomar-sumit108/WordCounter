# Word Counter!

  - Slice Assignment
  - Build using SpringBoot and gradle as the dependency management tool.
  
    Api Endpoints:

        - PUT http://localhost:8080/word/<word> → Increments word count and returns HTTP 200
        - GET http://localhost:8080/word/<word> → Returns the count of the word
    
    Assumptions:
    
        - When the word is not present it return 0
        - Gives error when word is empty
    
    Instructions to run:
      - Make sure port 8080 and 3306 are empty
      - Install docker and docker-compose 
      - Go the main WordCounter folder
      - First generate jar using the following command
            ```
                $ ./gradlew build
            ```
      - Following command is used to run it.
            ```
                $ sudo docker-compose up --build
            ```
        -Follwing command is used to stop the container
            ```
                $ sudo docker-compose down
            ```
    
    
