def call(String username = 'null') {
	echo "This is shared library greeting user: ${username}"
	pipeline {
		enviornment {
			user-name = "${username}"
		}
		agent any
		stages {
			stage('stage1') {
				steps {
					echo "Hi $user-name, how are you"
				}
			}
		}

	}
}
