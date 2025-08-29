# Linear Regression and Logistic Regression Example
# Author: Vishal Example

import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression, LogisticRegression
from sklearn.metrics import mean_squared_error, accuracy_score

# ----------------------------
# 1. Linear Regression Example
# ----------------------------

# Sample dataset: Hours studied vs Marks obtained
X_linear = np.array([[1], [2], [3], [4], [5], [6], [7], [8], [9]])
y_linear = np.array([10, 20, 30, 40, 50, 60, 70, 80, 90])

# Train-test split
X_train, X_test, y_train, y_test = train_test_split(X_linear, y_linear, test_size=0.2, random_state=42)

# Model training
linear_model = LinearRegression()
linear_model.fit(X_train, y_train)

# Prediction
y_pred_linear = linear_model.predict(X_test)

print("=== Linear Regression ===")
print("Predicted values:", y_pred_linear)
print("Mean Squared Error:", mean_squared_error(y_test, y_pred_linear))
print("Model Coefficient (slope):", linear_model.coef_)
print("Model Intercept:", linear_model.intercept_)
print()

# -----------------------------
# 2. Logistic Regression Example
# -----------------------------

# Sample dataset: Hours studied -> Pass (1) / Fail (0)
X_logistic = np.array([[1], [2], [3], [4], [5], [6], [7], [8], [9]])
y_logistic = np.array([0, 0, 0, 0, 1, 1, 1, 1, 1])  # Assume passing starts after 5 hours

# Train-test split
X_train, X_test, y_train, y_test = train_test_split(X_logistic, y_logistic, test_size=0.2, random_state=42)

# Model training
logistic_model = LogisticRegression()
logistic_model.fit(X_train, y_train)

# Prediction
y_pred_logistic = logistic_model.predict(X_test)

print("=== Logistic Regression ===")
print("Predicted values:", y_pred_logistic)
print("Accuracy:", accuracy_score(y_test, y_pred_logistic))
print("Model Coefficients:", logistic_model.coef_)
print("Model Intercept:", logistic_model.intercept_)
