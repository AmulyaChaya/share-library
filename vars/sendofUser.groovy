def call(String username = 'null', Int age = 27) {
  echo "This is share library welcoming: ${username}"
    pipeline {
        environment{
          user_name = "${username}"
          age = "${age}"
        }
        agent any
        stages {
            stage('stage1') {
                steps {
                  echo "displaying user name $user_name"
                }
            }
            stage('stage2'){
                steps {
                    echo "displaying user age $age" 
                }
            }
        }  
    }
}
