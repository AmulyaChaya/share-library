def call(String username = 'null', String age = 'null') {
  echo "This is share library welcoming: ${username}"
   pipeline {
		environment {
			USER_NAME = "$username"
			DESG = "${age}"
		}
		agent any 
		stages {
			stage('SENDOF_USER') {
				steps {
					echo "Bye $USER_NAME, Nice meeting you !"
					echo "Designation: $DESG"
				}	
			}
		}
	}
}
