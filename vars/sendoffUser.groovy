def call(String username = 'null', String age = 'null') {
	echo "This is shared library sendoffUser: ${username}"
	pipeline {
		environment {
			USER_NAME = "$username"
			USER_AGE = "$age"
		}
		agent any 
		stages {
			stage('SENDOF_USER') {
				steps {
					echo "Bye $USER_NAME, Nice meeting you !"
				}	
			}
			stage('satge2') {
				steps {
					echo "User Age: $USER_AGE"	
				}		
			}	
		}
	}
}
