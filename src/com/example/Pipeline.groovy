package com.example

class Pipeline {
    def script
    def configurationFile

    Pipeline(script, configurationFile) {
        this.script = script
        this.configurationFile = configurationFile
    }

    def execute() {
//    ===================== Your Code Starts Here =====================
//    Note : use "script" to access objects from jenkins pipeline run (WorkflowScript passed from Jenkinsfile)
//           for example: script.node(), script.stage() etc
    
//    ===================== Parse configuration file ==================

//    ===================== Run pipeline stages =======================
    stages {
        stage('build') {
            steps {
                script {
                projectFolder('project')
                }    
            }
        }
    }       
        
    /*script.stage("build")
    script.stage("database")
    script.stage("deploy")
    script.stage("test")*/    
//    ===================== End pipeline ==============================
    }
}

def projectFolder(String folder) {
            folder: 'folder'
            echo folder
    } 
