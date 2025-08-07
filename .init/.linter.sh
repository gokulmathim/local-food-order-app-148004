#!/bin/bash
cd /home/kavia/workspace/code-generation/local-food-order-app-148004/food_ordering_android_frontend
./gradlew lint
LINT_EXIT_CODE=$?
if [ $LINT_EXIT_CODE -ne 0 ]; then
   exit 1
fi

