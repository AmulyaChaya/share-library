def call(String username = 'null') {
	echo "This is shared library greeting user: ${username}"
	pipeline {
		environment{
			user_name = "${username}"
		}
		agent any
		stages {
			stage('stage1') {
				steps {
					echo "Hi $user_name, how are you"
				}
			}
		}

	}
}
