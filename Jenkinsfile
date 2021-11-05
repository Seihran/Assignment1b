pipeline {
	agent any
	
	stages {
		stage ('Build') {
			steps {
				git 'https://github.com/Seihran/Assignment1b.git'
				bat './gradlew build'
			}
		}
		stage ('Test') {
			steps {
				bat './gradlew check'
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