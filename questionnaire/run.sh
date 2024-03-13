#!/bin/bash

# Build the Docker image
docker build -t questionnaire .

# Run the Docker container, mapping port 5000 on the host to port 8080 on the container
docker run -p 5000:8080 questionnaire
