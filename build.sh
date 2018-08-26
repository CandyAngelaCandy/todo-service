#!/bin/bash

./gradlew clean bootRepackage

docker build --rm . --tag huangyanyan/user-service:${VER:?invalid version}
docker push huangyanyan/user-service:${VER:?invalid version}

export VER
docker stack deploy todo -c docker-compose.yml