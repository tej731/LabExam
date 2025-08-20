pipeline{
  agent any{
    stages{
      stage('Build'){
        steps{
          echo 'Compiling the code'
          bat 'factorial.java Testfactorial.java'
        }
      }
      stage('Test'){
        steps{
          echo 'Running the test cases'
          bat 'java Testfactorial'
        }
      }
      stage('Run'){
        steps{
          echo 'Running the main program'
          bat 'java factorial'
        }
      }
      stage('Package JAR'){
        steps{
          echo 'Packaging the JAR file'
          bat 'jar cfm factorial.jar manifest.txt factorial.class'
        }
      }
      stage('Archive JAR'){
        steps{
          echo 'Archiving the JAR file'
          archiveArifacts arifacts: 'factorial.jar', onlyIfSuccessful:true
        }
      }
    }
  }
