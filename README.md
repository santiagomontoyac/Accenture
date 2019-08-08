# Configuration of AccentureRegisterBank


### Installation back end
1. Clone the repositories on the desired route of the pc ***\<PATH\>***:
   It can be cloned using the following form:


    ```
    1. Enter a source destination folder and execute the command:
	   git clone -b master https://github.com/santiagomontoyac/Accenture.git

    ```  

	
2. Add path Variable  ***SOURCE_LOC*** on Spring Boot (or Eclipse)  
    - go to: ***Windows -> preferences -> general -> workspaces -> Linked Resources***
    - Click in New, to write:  
    -- **Name:** SOURCE_LOC  
    -- **Location:** ***\<PATH\>***  (Replace <PATH> with the path of the **Accenture** folder previously cloned in point 1.)	

3. Import the project from IDE Spring Boot (or Eclipse)  
    - ClicK on ***File/Import...***
    - select ***Maven/Existing Maven Projects***
    - Click on ***Browse...*** and select the  ***\<PATH\>*** where the repository was cloned.
    - select the maven projects and then press click on *Finish*  

4. Update the components:

    - Right click in project on the Package Explorer
    - Click on *Maven > Update Project*
    - select the project and then click in OK  
    
5. Run the project as a Spring Boot App or java application
	

### Installation Front end

You can choose the text editor of your choice. however, the development was done in Visual Studio Code.


1.  import the project "client" in the visual studio code (or your favorite text editor):
  
    - Click in File
    - Open Folder
    - Find and select the project "client" (you must enter the client folder to load the project)

2.  Run the project with the option ---->   "ng serve -o"
