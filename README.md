# 社員管理システム API

## 概要

社内統合システムのうち社員を管理するためのシステムの API です。

## 環境

- java

  openjdk 17.0.7

- db

  mysql 8.0.33

## 準備

### DB

ローカルで動かすために以下 SQL ファイルを実行してください。

- db/init/create_db.sql
- db/init/create_table.sql
- db/init/init_employee.sql

### テストツール

Postman をインストールしてください。
https://qiita.com/ponsuke0531/items/03483449ea0df505a540

## 機能

### 社員

#### 取得

URL：employee/find

ローカルテスト

例）ID が 5、6、7 の社員取得

`http://localhost:8080/employee/find?ids=5&ids=6&ids=7`
