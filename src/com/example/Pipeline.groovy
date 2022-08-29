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
    def datas = readYaml file: 'configurationFile', text: "something: 'Override'"
        assert datas.something == 'Override'
//    ===================== Run pipeline stages =======================
        script.stage("build"){
        }
        script.stage("database"){
        }
        script.stage("deploy"){
        }
        script.stage("test"){
        }
//    ===================== End pipeline ==============================
    }
}


