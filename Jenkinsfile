pipeline {
	agent any
	
	stages {
		stage ('Build') {
			steps {
				sh './gradlew build'
			}
		}
		stage ('Test') {
			steps {
				sh './gradlew check'
			}
		}
		post{
			always{
				archiveArtifacts artifacts: 'test/java/StudentTest.java'
				junit 'build/TEST-StudentTest.xml'
			}
		}
	}
}