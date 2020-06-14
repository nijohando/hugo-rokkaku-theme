+++
title = "Hugo用Theme「六角」について"
date = "2016-12-23"
lastmod = "2020-06-20"
tags = ["hugo", "theme", "design"]
archives = "2016"
toc = true
+++

『六角』は日本語と長文の読みやすさを重視したHugo用テーマ。
明朝体のWebフォントをベースとした和風基調と文書構造を把握しやすい２ペイン方式の目次が特徴。

<!--more-->

## インストール

Hugoのサイトディレクトリのルートでテーマをclone。

```
git clone https://github.com/nijohando/hugo-rokkaku-theme.git themes/rokkaku
```

config.toml でテーマを指定。

```toml
theme = "rokkaku"
```

## セットアップ

### ロゴとタイトル

画面上部のタイトルとロゴを設定する。

```toml
title = "六角"
[params]
  logoHtml = "<figure><ul class=\"c-logo\"><li/><li/><li/></ul></figure>"
```

### 表示する最新記事件数

最新記事一覧画面に表示する件数を設定する。

```toml
[params]
  limitNumberOfLatests = 5
```

### 著作権表示

画面下部に表示する著作権表示の内容を設定する。

```toml
[params]
  copyrightHtml = "Copyright &copy; nijohando.jp 2016&ndash;2020"
```

### サイト固有スタイルシートの追加

サイト固有のスタイルシートを追加したい場合、config.toml にてスタイルシートをパスを指定する。

```toml
[params]
  styles = ["/css/logo.css"]
```

### シンタックスハイライト

シンタックスハイライトには[highlightjs](https://highlightjs.org/)を利用。デフォルトではCDN版を利用する。

```html
<script src="//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.9.0/highlight.min.js"></script>
```

CDN版では対応言語が不足している場合、config.toml にて任意のhighlight.jsを指定可能。

```toml
[params]
  [params.highlightjs]
    url = "/js/highlight.pack.js"
```

### WEBアイコンフォント

アイコンフォントに[Font Awesome](http://fontawesome.io/)を利用する。デフォルトではBootstrap CDN版を使用する。

```html
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
```

Font Awesome CDNのembed code版をを利用したい場合は、 config.toml にて embed code を指定する。

```toml
[params]
  [params.fontAwesome]
    embedCode = "xxxx"
```

### Googleアナリティクス

Googleアナリティクスを利用する場合は、 config.toml にて トラッキングID を指定する。


```toml
[params]
  [params.ga]
    trackingId = "xxxx"
```

## 日付について

### 記事の作成日と更新日

記事一覧画面、記事画面ともに記載される日付には作成日が使用される。
更新日については記事一覧画面では作成日の下に日付印形式(小)で表示され、記事画面では画面右上に日付印形式（大）で表示される。

フロントマターに作成日は *date* プロパティとして、更新日は *lastmod* プロパティとして定義する。(更新が発生していない場合 lastmodプロパティの定義は不要)

```
+++
date    = "2016-12-23"
lastmod = "2016-12-27"
+++
```

### 日本語化された月と曜日表示

月と曜日が日本語化されている。
`data/jmonth.toml` `data/jweekday.toml` に月、曜日に応じた文字列が定義可能。



## 目次について

記事毎に目次の表示を有効、無効が指定できる。  
フロントマター *toc* プロパティを有効にすることで **ブラウザのウインドウサイズが800px以上の幅を持つ場合** 画面右側に表示される。

```
+++
toc = true
+++
```
## 年別の記事一覧表示

画面下部のTaxonomyフッタに記事の年別一覧画面へのリンクが表示される。
フロントマター *archives* プロパティ に年を指定することで当該記事が指定の年別記事一覧に表示される。

```
+++
archives = "2016"
+++
```
