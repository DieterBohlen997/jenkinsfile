import hudson.model.Job

def helper = {
  Job job = currentBuild.rawBuild.parent
  println(job.definition.scm)
}

pipeline{
  agent any
  stages{
    stage('asd'){
      steps{
        println('asdasdasdasd')
        helper()
      }
    }
  }
}
