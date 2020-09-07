node {
    def useDeploy = true
    def useSwitch = true
    def useNode = true
    def useSlack = true

    stage("Flow Check", {
        try {
            println " DEPLOY FLOW = $USE_DEPLOY"
            useBuild = "$USE_DEPLOY" == "true"
        } catch (MissingPropertyException e) {
            println " BUILD DEPLOY = true"
        }

        try {
            println " SWITCH FLOW = $USE_SWITCH"
            useBuild = "$USE_SWITCH" == "true"
        } catch (MissingPropertyException e) {
            println " SWITCH FLOW = true"
        }
    })

    stage("Parameter Check", {
        //println " BUILD_USER = $BUILD_USER"
        //println " CONFIG_NAME = $CONFIG_NAME"
        //println " REMOTE_PATH = $REMOTE_PATH"
        //println " TARGET_USER = $TARGET_USER"
       // println " TARGET_SERVER = $TARGET_SERVER"
        println " GIT_URL = $GIT_URL"
        println " BRANCH_SELECTOR = $BRANCH_SELECTOR"
        println " GRADLE_VERSION = $GRADLE_VERSION"
        println " JAVA_VERSION = $JAVA_VERSION"

        env.JAVA_HOME="${tool name : JAVA_VERSION}"
        env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"

        try {
            println " SLACK_TOKEN = $SLACK_TOKEN"
        }
        catch (MissingPropertyException e) {
            useSlack = false
        }

        try {
            println " NODE_VERSION = $NODE_VERSION"
        }
        catch (MissingPropertyException e) {
            useNode = false
        }
    })

    stage("Git CheckOut", {
        println "Git CheckOut Started"
        checkout(
            [
                $class : 'GitSCM',
                branches : [[name: '${BRANCH_SELECTOR}']],
                doGenerateSubmoduleConfigurations: false,
                extensions : [],
                submoduleCfg : [],
                userRemoteConfigs : [[url: '${GIT_URL']]
            ]
        )
        println "Git CheckOut End"
    })

    stage("Build" {
       // nvm('version' : "${NODE_VERSION}") {
            println "Build Started"
            try {
                sh "./gradlew build"
               // sh "${tool name: GRADLE_VERSION, type: 'hudson.plugins.gradle.GradleInstallation'}/bin/gradle test -Dorg.gradle.daemon=true"
            }
            finally {
               // junit allowEmptyResults: true, keepLongStdio: true, testResults: 'build/test-results/*.xml'
            }
            println "Build End"
       // }
    })

    stage("Deploy", {
        if(useDeploy) {
            println "Deploy Started"
            // sh "****"
            println "Deploy End"
        }
        else {
            println "Deploy Skip"
        }
    })

    stage("Switch", {
        if(useSwitch) {
            println "Switch Started"
            // sh "****"
            println "Switch End"
        }
        else { println "Switch Skip" }
    })

}