#!/bin/bash

function make_creds {
    mkdir ~/.bintray/
    FILE=$HOME/.bintray/.credentials
    cat <<EOF >$FILE
    realm = Bintray API Realm
    host = api.bintray.com
    user = $BINTRAY_USER
    password = $BINTRAY_API_KEY
    EOF
}

make_creds
cd $TRAVIS_BUILD_DIR
sbt release

