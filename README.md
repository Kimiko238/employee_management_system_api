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

Response

```json
{
  "employeeList": [
    {
      "nameFirst": "テスト名前１",
      "nameLast": "テスト苗字１",
      "nameFirstKana": "テストナマエ１",
      "nameLastKana": "テストミョウジ１",
      "employeePosition": null,
      "systemRole": null,
      "postalCode": "100-0001",
      "prefectures": "東京都",
      "municipalities": "千代田区",
      "address1": "テスト町",
      "address2": "テスト1-11-1",
      "phoneNumber": null,
      "birthday": null,
      "sex": null
    },
    {
      "nameFirst": "テスト名前２",
      "nameLast": "テスト苗字２",
      "nameFirstKana": "テストナマエ２",
      "nameLastKana": "テストミョウジ２",
      "employeePosition": null,
      "systemRole": null,
      "postalCode": "100-0002",
      "prefectures": "東京都",
      "municipalities": "千代田区",
      "address1": "テスト町",
      "address2": "テスト1-11-2",
      "phoneNumber": null,
      "birthday": null,
      "sex": null
    },
    {
      "nameFirst": "テスト名前３",
      "nameLast": "テスト苗字３",
      "nameFirstKana": "テストナマエ３",
      "nameLastKana": "テストミョウジ３",
      "employeePosition": null,
      "systemRole": null,
      "postalCode": "100-0003",
      "prefectures": "東京都",
      "municipalities": "千代田区",
      "address1": "テスト町",
      "address2": "テスト1-11-3",
      "phoneNumber": null,
      "birthday": null,
      "sex": null
    }
  ]
}
```
