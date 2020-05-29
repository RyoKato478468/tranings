FROM centos:7

RUN yum install -y java-11-openjdk which
RUN yum install -y java-1.8.0-openjdk
RUN yum install -y java-1.8.0-openjdk-devel

RUN curl https://bintray.com/sbt/rpm/rpm > bintray-sbt-rpm.repo
RUN mv bintray-sbt-rpm.repo /etc/yum.repos.d/
RUN yum install -y sbt
RUN yum update -y

COPY app01 /var/app01
WORKDIR /var/app01
RUN sbt compile
RUN sbt run