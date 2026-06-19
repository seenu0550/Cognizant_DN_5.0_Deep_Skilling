# 🛒 E-commerce Platform Search Function

## 🎯 Objective

The primary goal of this project is to implement and analyze different search algorithms used in an e-commerce platform. It demonstrates how algorithm efficiency influences search performance as the volume of product data increases.

## 📖 Problem Statement

Fast and efficient product searching is essential for a seamless user experience in e-commerce applications. This project explores the implementation of **Linear Search** and **Binary Search** algorithms and evaluates their performance in locating products within a dataset.

## 🧠 Understanding Asymptotic Notation

**Big O Notation** is used to measure an algorithm's efficiency by describing how its execution time grows with the size of the input data.

### 📊 Search Scenarios

* ✅ **Best Case:** The target product is found immediately *(O(1))*.
* ⚡ **Average Case:** The target product is found somewhere in the middle of the dataset *(O(n))*.
* ❌ **Worst Case:** The product is at the end of the dataset or not present at all *(O(n) for Linear Search, O(log n) for Binary Search)*.

## 🏗️ Product Class

A `Product` class is created with the following attributes:

* 🆔 Product ID
* 📦 Product Name
* 🏷️ Category

These attributes are used to perform search operations on the product dataset.

## 🔍 Search Algorithms Implemented

### 1️⃣ Linear Search

* Traverses the array sequentially.
* Compares each product with the target value.
* Suitable for small or unsorted datasets.

### 2️⃣ Binary Search

* Requires the dataset to be sorted.
* Uses a divide-and-conquer approach.
* Significantly reduces the number of comparisons.

## 📈 Performance Analysis

| 🔎 Search Algorithm | ⏱️ Time Complexity | 📌 Suitable For            |
| ------------------- | ------------------ | -------------------------- |
| Linear Search       | O(n)               | Small or unsorted datasets |
| Binary Search       | O(log n)           | Large and sorted datasets  |

## 📝 Conclusion

* ✅ **Linear Search** is simple to implement and works well with unsorted data.
* 🚀 **Binary Search** offers much faster search performance for large datasets but requires the data to be sorted beforehand.
* 🎯 For large-scale e-commerce platforms, **Binary Search** is generally the preferred choice due to its superior efficiency and scalability.
