+++
title = "Hugo用Theme「六角」について"
date = "2016-12-23"
lastmod = "2016-12-31"
tags = ["hugo", "theme", "design"]
archives = "2016"
toc = true
+++

「六角」は日本語と長文の読みやさに重きを置いたテーマです。

<!--more-->

# カスタマイズ

## ロゴとタイトル

タイトルは *title* プロパティ、ロゴは *params* の *logoHtml* プロパティで定義します。

```toml
title = "六角"
[params]
  logoHtml = "<figure><ul class=\"c-logo\"><li/><li/><li/></ul></figure>"
```

logoHtmlプロパティにはhtmlコードが直接指定できます。


## 表示する最新記事数

config.tomlの *params* の *limitNumberOfLatests* に表示する最新の記事数を指定します。

```toml
[params]
  limitNumberOfLatests = 5
```

## 著作権表示

著作権表示は *params* の *logoHtml* プロパティで定義します。

```toml
[params]
  copyrightHtml = "Copyright &copy; nijohando.jp 2016&ndash;2017"
```

copyrightHtmlプロパティにはhtmlコードが直接指定できます。

## シンタックスハイライト

デフォルトではCDN上のhighlight.jsを利用します。

```html
<script src="//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.9.0/highlight.min.js"></script>
```

デフォルトでは対応言語が不足している場合、config.tomlに定義することで任意のURL上のhighlight.jsを読み込みます。

```toml
[params]
  [params.highlightjs]
    url = "/js/highlight.pack.js"
```

## WEBアイコンフォント

[Font Awesome](http://fontawesome.io/)を利用しています。

デフォルトではBootstrap CDN上のfont-awesomeを利用します。

```html
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
```

Bootstrap CDNではなくFont Awesome CDNのembed codeを利用する場合はconfig.tomlにembed codeを定義します。

```toml
[params]
  [params.fontAwesome]
    embedCode = "xxxx"
```

## Googleアナリティクス

config.tomlの *params.ga* へ *trackingId* を指定することでGoogleアナリティクスが有効になります。


```toml
[params]
  [params.ga]
    trackingId = "xxxx"
```


# 機能説明

## 記事の作成日と更新日

記事の作成日と加筆、修正した更新日を区別して表示します。

フロントマターに作成日は *date* プロパティとして、更新日は *lastmod* プロパティとして定義します。(更新が発生していない場合 lastmodプロパティの定義は不要です)

```
+++
date    = "2016-12-23"
lastmod = "2016-12-27"
+++
```

lastmodプロパティを定義すると記事の一覧画面では日付（作成日）の下に更新日の日付印(小)が表示されるようになります。
また記事画面では画面右上に日付印(大)の透かしが表示されます。


## 目次の表示

比較的長文になりがちな技術ブログのための目次表示です。記事毎に目次の表示を有効、無効にできます。

フロントマターに *toc* プロパティを追加することで **ブラウザのウインドウサイズが800px以上の幅を持つ場合**、画面右側に目次が表示されます。(この画面にも目次が表示されます）

```
+++
toc = true
+++
```
## 日本語化された月と曜日表示

月と曜日が日本語化されています。
`data/jmonth.toml` `data/jweekday.toml` に月、曜日に応じた文字列が定義できるよいうになっています。


## 記事の年別グルーピング

Taxonomy `archives` に年を指定することで年別のアーカイブ表示ができます。年別のアーカイブ表示は画面下部のTaxonomyフッタから遷移できます。

```
+++
archives = "2016"
+++
```
