1.  To Check if git is there in your m/c or not ==> git --version
2.  If not present ==> download git using link("https://git-scm.com/downloads")
3.  Install the downloaded "**.exe" file and restart the terminal
4.  To check if git has any registered user ==> git config --global --list
5.  Irrespective of user found or not, if want to register as an user follow these commands ==> 
    i) ==> git config --global user.name <username>
    ii) ==> git config --global user.email <user_email_id> 
    ...
    registered user should have minimum of two attributes atleast, so using only two as of now
6.  Git only tracks the files which are there in "Staging Area / Git repository" and not just in "Working Directory". 
    To create Git repository use command ==> git intit / git init -b <branch_name>(optional), 
    It will create .git folder in your project folder which represents the "Staging Area or Git repository".
7.  To Check if the files have been added to the Git repository or not ==> git status
8.  To add any/all file to the Staging area from the working directory ==> git add <file_name_with_extention> / git add .
9.  To unstage any file if required from Staging area ==> git rm --cached <file_name_with_extention>
10. Commiting(Saving) any file can only be done if the file exist in Staging area and for Committing all the staged 
    files will use ==>  git commit -m <logical_message>
11. To check all the logs of current branch commits ==> git log
12. If want to skip the staging area and directly commit the changes ==> git commit -a -m <logical_message>






Git Commands ===>>>>
2.  git config --global user.name <username>
1.  git --version
3.  git config --global user.email <user_email_id> 
4.  git config --global --list
5.  git intit / git init -b <branch_name>(optional)
6.  git status
7.  git add <file_name_with_extention> / git add .
8.  git rm --cached <file_name_with_extention>
9.  git commit -m <logical_message>
10. git log
11. git commit -a -m <logical_message>